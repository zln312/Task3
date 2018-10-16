import com.entity.Art;
import com.entity.Words;
import com.mapper.*;

import org.apache.log4j.Logger;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ArtTest {
    private static Logger logger;
    private static Art art;


    @Before
    public void before() {
        logger = Logger.getLogger(ArtTest.class);
    }

    @Autowired
    ArtMapper artMapper;

    @Autowired
    FirstMapper firstMapper;
    @Autowired
    SecondMapper secondMapper;
    @Autowired
    WorksMapper worksMapper;
    @Autowired
    WordsMapper wordsMapper;

    @Test
    public void add() {

        logger.info(firstMapper.selectByPrimaryKey(null, false));


//        logger.info(artMapper.selectByPrimaryKey(1));
    }

    @Test
    public void delete() {
        logger.info(secondMapper.select(null, null, 4l));

    }

    @Test
    public void update() {
        logger.info(worksMapper.select("额", 4l));
    }

    @Test
    public void show(){
        Words words=new Words();
        words.setVisitor("挡拆");
        words.setContent("ahdh ");
        words.setWorksId(3l);
        logger.info(wordsMapper.insertSelective(words));
    }
}



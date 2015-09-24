package database;

import com.database.TileDAO;
import com.database.model.Tile;
import com.database.model.meta.Meta;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Nazymko on 22/09/2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:starter-pack/module-persistence.xml"})
public class TileDAOTest extends TestCase {

    @Autowired
    TileDAO daoForTest;
    @Test
    public void testSave() throws Exception {
        daoForTest.save(new Tile("body", "header", new Meta()));
    }
}
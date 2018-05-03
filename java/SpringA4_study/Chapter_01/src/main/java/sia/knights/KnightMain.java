package sia.knights;

import org.apache.log4j.Logger;
import org.springframework.context.support.
                   ClassPathXmlApplicationContext;

public class KnightMain {

  private static final Logger logger = Logger.getLogger(KnightMain.class);

  public static void main(String[] args) throws Exception {
   /* ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext(
            "META-INF/spring/knight.xml");*/
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext(
                    "META-INF/spring/minstrel.xml");
    Knight knight = context.getBean(Knight.class);
    knight.embarkOnQuest();
    context.close();
  }

}

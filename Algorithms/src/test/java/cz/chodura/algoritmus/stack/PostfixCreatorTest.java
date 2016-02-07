package cz.chodura.algoritmus.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PostfixCreatorTest {

   PostfixCreator creator = new PostfixCreator();

   @Test
   public void simpleTransform() {

      // Act
      String postfixExpression = creator.transformFromInfix("5+2*6");

      // Assert
      assertEquals("526*+", postfixExpression);
   }

}

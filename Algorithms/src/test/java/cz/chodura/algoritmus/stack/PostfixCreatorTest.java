package cz.chodura.algoritmus.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PostfixCreatorTest {

   @Test
   public void simpleTransform() {

      PostfixCreator creator = new PostfixCreator();

      // Arange
      String infixExpression = "5+2*6";

      // Act
      String postfixExpression = creator.transformFromInfix(infixExpression);

      // Assert
      assertEquals("526*+", postfixExpression);
   }

}

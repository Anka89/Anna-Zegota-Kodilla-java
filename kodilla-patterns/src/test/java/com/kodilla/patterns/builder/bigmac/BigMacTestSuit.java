package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;


public class BigMacTestSuit {
        @Test
        public void testBigmackNew() {
            //Given
            BigMac bigmac = new BigMac.BigMacBuilder()
                    .roll(Rolls.GRAHAM)
                    .burgers(2)
                    .sauce(Sauce.SPICY)
                    .ingredients(Ingredients.BACON)
                    .ingredients(Ingredients.JALAPENIO)
                    .ingredients(Ingredients.CUCUMBER)
                    .build();
            //When
            int howManyBurgers = bigmac.getBurgers();
            int howManyIngredients = bigmac.getIngredients().size();

            //Then
            Assert.assertEquals(2, howManyBurgers);
            Assert.assertEquals(3, howManyIngredients);
            Assert.assertTrue(bigmac.getIngredients().contains(Ingredients.BACON));
            Assert.assertFalse(bigmac.getIngredients().contains(Ingredients.CHEESE));
        }
}


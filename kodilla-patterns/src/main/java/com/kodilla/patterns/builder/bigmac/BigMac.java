package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
        private final Rolls roll;
        private final int burgers;
        private final Sauce sauce;
        private List<Ingredients> ingredients;

        public static class BigMacBuilder {
            private Rolls roll;
            private int burgers;
            private Sauce sauce;
            private List<Ingredients> ingredients = new ArrayList<>();

            public BigMacBuilder roll(Rolls roll) {
                this.roll = roll;
                return this;
            }

            public BigMacBuilder burgers(int burgers) {
                this.burgers = burgers;
                return this;
            }

            public BigMacBuilder sauce(Sauce sauce) {
                this.sauce = sauce;
                return this;
            }

            public BigMacBuilder ingredients(Ingredients ingredient) {
                ingredients.add(ingredient);
                return this;
            }

            public BigMac build() {
                return new BigMac(roll, burgers, sauce, ingredients);
            }
        }

    public BigMac(Rolls roll, int burgers, Sauce sauce, List<Ingredients> ingredients){
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

        public Rolls getRoll() {
            return roll;
        }

        public int getBurgers() {
            return burgers;
        }

        public Sauce getSauce() {
            return sauce;
        }

        public List<Ingredients> getIngredients() {
            return ingredients;
        }
    }

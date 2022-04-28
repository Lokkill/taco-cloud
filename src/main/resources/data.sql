delete from Taco_Order_Tacos;
delete from Taco_Ingredients;
delete from Taco;
delete from Taco_Order;
delete from Ingredient;

insert into Ingredient (id, name, type) values ("FLTO", "Flour Tortilla", Ingredient.Type.WRAP);
insert into Ingredient (id, name, type) values("COTO", "Corn Tortilla", Ingredient.Type.WRAP);
insert into Ingredient (id, name, type) values("GBRF", "Ground Beef", Ingredient.Type.PROTEIN);
insert into Ingredient (id, name, type) values("CARN", "Carnitas", Ingredient.Type.PROTEIN);
insert into Ingredient (id, name, type) values("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES);
insert into Ingredient (id, name, type) values("LETC", "Lettuce", Ingredient.Type.VEGGIES);
insert into Ingredient (id, name, type) values("CHED", "Cheddar", Ingredient.Type.CHEESE);
insert into Ingredient (id, name, type) values("JACK", "Monterrey Jack", Ingredient.Type.CHEESE);
insert into Ingredient (id, name, type) values("SLSA", "Salsa", Ingredient.Type.SAUCE);
insert into Ingredient (id, name, type) values("SRCR", "Sour Cream", Ingredient.Type.SAUCE);

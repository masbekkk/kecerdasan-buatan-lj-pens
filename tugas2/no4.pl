cat(garfield).
cat(sylveator).
cannary(tweety).
penguin(opue).
bird(X):-cannary(X).
bird(X):-penguin(X).
dog(bark).
mammal(X):-dog(X).
mammal(X):-cat(X).
animal(X):-mammal(X).
animal(X):-bird(X).
pet(X):-cat(X).
pet(X):-dog(X).
pet(X):-cannary(X).
eats(X,catfood):-cat(X).
eats(X,lasagna):- X == garfield.
eats(X,seeds):-bird(X).
has_part(X,tail):-mammal(X).
has_part(X,tail):-bird(X).
has_part(X,wing):-bird(X).
has_part(X,feather):-bird(X).
can(X,fly):-bird(X), X == tweety.
cannot(X,fly):- X == opue.

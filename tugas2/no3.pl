bird(pipit).
dragonfly(capung).
ant(semut).
insect(X):-dragonfly(X).
insect(X):-ant(X).
invertebrate(X):-insect(X).
livingbeing(X):-insect(X).
livingbeing(X):-bird(X).
can(X,fly):-insect(X), X == capung.
builds_a(X,nest):-bird(X).
builds_a(X,nest):-ant(X).
has(X,wings):-dragonfly(X).

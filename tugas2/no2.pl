man(oscar).
woman(antje).
person(X):-man(X).
person(X):-woman(X).
married_to(oscar,antje).
married_to(antje,oscar).
father_of(bernd,oscar).
mother_of(bernd,antje).
cousins_of(bernd,susi).
cousins_of(susi,bernd).
uncle_of(susi,oscar).
aunt_of(susi,antje).

lelaki(anas).
lulusansd(anas).
wni(anas).
lahir(anas, 1962).
age(X, Y, AGE):-lahir(X, BIRTH), AGE is(Y-BIRTH).
daftarpns(X, YEAR):-age(X, YEAR, UMUR), UMUR <36.
pns(X,Y):-wni(X), lulusansd(X), daftarpns(X,Y).
pensiun(X, YEAR):-wni(X), age(X, YEAR, UMUR), UMUR >=60.
/* tahun(2021). */

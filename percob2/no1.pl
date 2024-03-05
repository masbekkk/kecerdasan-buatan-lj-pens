lelaki(agus).
kebangsaanx(agus).
lahir(agus, 1908).
fana(X):-lelaki(X).
age(X, AGE):-lahir(X, BIRTH), tahun(Y), AGE is(Y-BIRTH).
mati(X):-kebangsaanx(X), age(X, UMUR), UMUR > 90.
mati(X):-kebangsaanx(X), year(Y), Y > 1995.
tahun(2002).
year(1994).

noun([N], katabenda(N)) :- member(N, [kucing, budi, satpam, ibu, sayur]).
verb([V], katakerja(V)) :- member(V, [makan, minum, beli]).
sentence(S, kalimat(NPTree, VPTree, NPTree)) :- noun(N, NPTree), verb(V, VPTree), append(N,V,N,S).

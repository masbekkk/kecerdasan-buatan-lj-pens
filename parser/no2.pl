noun([N], katabenda(N)) :- member(N, [kucing,ibu,satpam,sayur]).
verb([V], katakerja(V)) :- member(V, [makan,minum,baca,beli]).
determiner([D],determinan(D)):- member(D,[seorang,seekor]).
noun_phrase(NP,subyek(DTree, NPTree)):- determiner(D, DTree), noun(N,NTree),append(D,N,NP).
verb_phrase(VP,predikat(VTree)):-verb(VP,VTree).
verb_phrase(VP,frasa_kerja(VTree,NTree)):-verb(V,VTree),noun(N,NTree),append(V,N,VP).
sentence(S,kalimat(NPTree, VPTree)) :- noun_phrase(NP,NPTree), verb_phrase(V,VPTree),append(NP,VP,S).


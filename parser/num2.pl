determiner([D], katasandang(D)) :-
    member(D, [seorang, sebutir, seekor, satu, dua, tiga]).

noun([N], katabenda(N)) :-
    member(N, [manusia, telur, wortel, saya]).

verb([V], katakerja(V)) :-
    member(V, [membeli, menjual]).

adj([A], kataketerangan(A)) :-
    member(A, [banyak, sedikit]).

subject([J], subjek(J)) :-
    member(J, [saya, bapak, ibu]).

noun_phrase(NP, frasa_benda(NTree)) :-
    noun(NP, NTree).

noun_phrase(NP, frasa_benda(DTree, NTree)) :-
    determiner(D, DTree),
    noun(N, NTree), append(D, N, NP).

verb_phrase(VP, frasa_kerja(VTree, ATree)) :-
    verb(V, VTree),
    adj(A, ATree), append(V, A, VP).

verb_phrase(VP, frasa_kerja(VTree)) :-
    verb(VP, VTree).

subject_phrase(JP, frasa_subjek(JTree)) :-
    subject(JP, JTree).

sub_sentece(SS, sub_kalimat(JPTree, VPTree)) :-
    subject_phrase(JP,JPTree),
    verb_phrase(VP,VPTree), append(JP,VP,SS).

sentence(S,kalimat(NPTree, VPTree)) :- noun_phrase(NP,NPTree), verb_phrase(V,VPTree),append(NP,VP,S).
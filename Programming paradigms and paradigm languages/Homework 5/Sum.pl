% Rules
sum([],0).
sum([Head|Tail],Sum) :- sum(Tail, SumT), Sum is Head + SumT.

% Query
?- sum([1, 2, 3, 4, 5, 4, 3, 2, 1], _X), write(_X).
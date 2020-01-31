max(X,Y) :-
    X=Y ->write("both are equal");
    X>Y ->write(X);
    X<Y ->write(Y).

datatype FOR = For of int * (int -> int);

val rec eval =
 fn For(n, f) => fn x =>
    if(n>0) then f(eval(For(n-1, f)) x) else x;

val f = fn x => 2*x;

eval(For(0,f)) 3;

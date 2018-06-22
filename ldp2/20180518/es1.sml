fun compute n f =
    if n = 0 then 0.0 else f(n-1) + compute (n-1) f;

fun square n = real(n*n);

compute 8 square;

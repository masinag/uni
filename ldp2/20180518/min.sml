fun min f n =
    let
	fun pmin n f = if n=0 then
			   f(0)
		       else
			   if f(n) < f(pmin(n-1)f) then n else pmin(n-1)f
								   
    in
	if n=0 then raise Fail("n must be > 0!") else pmin (n-1)f
    end;

fun id n = 100-n;

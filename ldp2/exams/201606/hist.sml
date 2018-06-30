val rec hist = fn [] => (fn _ => 0)
  | n :: l1 => (fn (a:real, b:real) =>
		   if (a-b) < n andalso n < (a+b) then 1 + hist l1 (a,b)
		   else hist l1 (a, b));
		  

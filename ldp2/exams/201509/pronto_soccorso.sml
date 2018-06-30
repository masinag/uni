datatype codice = rosso of string
		| giallo of string
		| verde of string;

local
    val getN = fn rosso(_) => 0
      | giallo(_) => 1
      | verde(_)  => 2;
in
val rec arriva =
 fn [] => (fn p => [p])
  | [a] => (fn p => if (getN a <= getN p) then [a, p] else [p, a])
  | a::b::l1 => (fn p => if ((getN a)<=(getN p) andalso (getN p)<(getN b)) then a::p::b::l1 else a::(arriva (b::l1) p))
		    
end;

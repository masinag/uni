val rec elementi_pari =
 fn [] => []
  | [a] => []
  | a::b::l1 => b::(elementi_pari l1); 

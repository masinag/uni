datatype Expr = X | Y | Avg of Expr * Expr | Mul of Expr * Expr;

val rec compute = fn X => (fn a => fn b => a)
  | Y => (fn a => fn b => b)
  | Avg(e1, e2) => (fn a => fn b => ((compute e1 a b) + (compute e2 a b)) div 2)			  
  | Mul(e1, e2) => (fn a => fn b => ((compute e1 a b) * (compute e2 a b)));
		

							     

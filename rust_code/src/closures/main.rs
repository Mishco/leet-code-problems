fn main() {
    let mut sum = 0;
    let add = |n1, n2| n1 + n2;

    for n in 3..10 {
        sum = add(sum, n);
    }
    println!("sum : {}", sum);
}

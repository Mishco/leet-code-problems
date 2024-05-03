mod bitwise;
mod strings;

use std::fs::File;
use std::io::Write;
use std::error::Error;

fn main() -> Result<(), Box<dyn Error>> {
    // println!("{}",bitwise::hamming_weight(11));
    println!(
        "{}",
        strings::longest_ideal_string(String::from("acfgbd"), 2)
    );

    // Write to file
    let filename = "data.txt";
    let mut file = File::create(filename)?;
    writeln!(&mut file, "Hello World!").unwrap();

    Ok(())
}


#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_roman_to_int() {
        assert_eq!(50, strings::roman_to_int(String::from("L")));
        assert_eq!(1994, strings::roman_to_int(String::from("MCMXCIV")));
    }
}
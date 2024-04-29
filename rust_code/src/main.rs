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

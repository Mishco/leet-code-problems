
pub fn longest_ideal_string(s: String, k: i32) -> i32 {
    let s = s.as_bytes();
    let n = s.len();
    let k = k as usize;

    let mut dp = vec![vec![1;n];n];
    let mut ans = 0;

    for i in 1..n {
        for j in 0..i {
            if (s[i] as i32 - s[j] as i32).abs() <= k as i32 {
                for idx in 0..j {
                    if (s[j] as i32 - s[idx] as i32).abs() <= k as i32 {
                        dp[i][j] = dp[i][j].max(dp[j][idx] + 1);
                    }
                }
                ans = ans.max(dp[i][j]);
            }
        }
    }

    return ans;
}


pub fn roman_to_int(s: String) -> i32 {
    let mut result = 0;
    let mut stream = s.chars().peekable();

    while let Some(current) = stream.next(){
        let next = stream.peek();
        result += match (current, next){
            ('I', Some('V')) => -1,
            ('I', Some('X')) => -1,
            ('X', Some('L')) => -10,
            ('X', Some('C')) => -10,
            ('C', Some('D')) => -100,
            ('C', Some('M')) => -100,
            ('I', _) => 1,
            ('V', _) => 5,
            ('X', _) => 10,
            ('L', _) => 50,
            ('C', _) => 100,
            ('D', _) => 500,
            ('M', _) => 1000,
            _ => panic!("Bad symbol")
        }
    }
    result
}

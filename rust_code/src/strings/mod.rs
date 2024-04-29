
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


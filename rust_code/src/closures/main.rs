enum TrafficLight {
    Red,
    Yellow,
    Green,
}


fn action(light: TrafficLight) -> &'static str {
    match light {
        TrafficLight::Red => "Stop",
        TrafficLight::Yellow => "Caution",
        TrafficLight::Green => "Go",
    }
}

fn main() {
    let mut light = TrafficLight::Green;
    println!("The light says: {}", action(light));

    light = TrafficLight::Yellow;
    println!("The light says: {}", action(light));

    light = TrafficLight::Red;
    println!("The light says: {}", action(light));


    let add = |n1, n2| n1 + n2;
    let sum_range = |from, to| {
        let mut sum = 0;

        for n in from..to {
            sum = add(sum, n);
        }
        sum
    };
    println!("sum : {}", sum_range(3, 11));
}

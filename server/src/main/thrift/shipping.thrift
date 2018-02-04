namespace java com.ben

enum ShippingType {
    ASAP
    NEXT_DAY,
    TWO_DAY,
    GROUND
}

struct Shipping {
    1: ShippingType type,
    2: string cost
}
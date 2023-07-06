import Foundation

@objc public class BatterySettings: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}

# 01 面向对象

## 本节目标

复习类与对象、封装、接口、多态和对象协作，并用用户、商品、订单构造一个很小的业务模型。重点观察调用方如何依赖接口，而不是绑定某一种实现。

## 代码实验

- `User` 保存用户标识和名称，并通过构造器保证对象创建时数据有效。
- `Product` 保存商品信息和单价。
- `OrderItem` 表示订单中的商品和购买数量。
- `Order` 管理订单项，并通过 `DiscountPolicy` 接口计算折扣金额。
- `PercentageDiscountPolicy` 是接口的一种实现，演示运行时多态。

在本目录运行：

```powershell
New-Item -ItemType Directory -Force out | Out-Null
javac -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object FullName)
java -cp out com.noviter.learning.oop.OrderDemo
```

预期输出展示订单原价、折扣金额和实付金额。

## 动手练习

1. 新增一个 `FixedAmountDiscountPolicy`，固定减去一定金额，并通过 `DiscountPolicy` 接口交给订单使用。
2. 让订单拒绝零或负数购买数量，并思考校验应放在 `OrderItem` 还是 `Order`。
3. 给 `Order` 加入订单编号和创建时间。时间类型先自行选择，并写下选择理由。
4. 不改 `Order` 的金额计算流程，替换折扣策略。记录这体现了什么设计好处。

## 复盘记录

完成实验后，在本目录新增或更新 `notes.md`，用自己的话回答：

- 类和对象分别是什么？本实验里的对象有哪些状态和行为？
- 封装阻止了哪些不合理的调用？哪些数据不应该直接暴露？
- `Order` 为什么接收 `DiscountPolicy`，而不是在内部判断折扣类型？
- `DiscountPolicy` 的不同实现如何体现多态？
- 你亲自新增了什么行为，遇到什么问题，如何验证结果？


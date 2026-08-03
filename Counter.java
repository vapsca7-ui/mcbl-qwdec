const scale = 1e30; // масштаб: 1 единица = 1e-30
let current = 1;    // это будет 1e-30

// Перебор:
for (let i = 0; i < 100; i++) {
  const realValue = current / scale;
  console.log(realValue.toExponential()); // вывод в экспоненциальной форме
  current++; // увеличиваем на 1 «минимальную единицу»
}

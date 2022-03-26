# エアコン温度設定プログラム
input_lines = readlines
# 室内温度
room = input_lines[0].to_i
# エアコン温度
air_conditoner = input_lines[1].to_i
# 温度差
temperature_diff = (room - air_conditoner).abs
# 所要時間変数の初期化
require_time = 0

if temperature_diff < 5
  require_time = 15
elsif temperature_diff >= 5 && temperature_diff < 10 then
  require_time = 30
elsif temperature_diff >= 10
  require_time = 60
end
# 所要時間表示
p require_time
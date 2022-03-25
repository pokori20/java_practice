arr = [
  ['A', 'B', 'C'],
  ['D', 'E', 'F'],
  ['G', 'H', 'I']
]
# each文の中にeachをすることで二次元配列に対応することが
arr.each do |inner_arr|
  inner_arr.each do |word|
    p word
  end
end
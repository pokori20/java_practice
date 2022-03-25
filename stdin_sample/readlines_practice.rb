lines = readlines
# linesの中身 ["HTML CSS JavaScript\n", "PHP Ruby Python\n", "Java Go C++\n"]
lines.each do |words|
  # chompは文字列末尾\nの改行を取り払うメソッド
  # splitメソッドで文字列を分割して配列として保存半角スペースを区切り文字として指定
  # ["HTML","CSS","JavaScript","PHP","Ruby","Python","Java","Go","C++"]
  words.chomp.split(' ').each do |word|
    p word
  end
end


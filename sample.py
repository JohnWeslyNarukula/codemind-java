
import matplotlib.pyplot as plt
import pandas as pd
file = pd.read_excel('spotifySo.csv')
x_axis = file['X values']
y_axis = file['Y values']
plt.bar(x_axis, y_axis, width=5)
plt.xlabel("X-Axis")
plt.ylabel("Y-Axis")
plt.show()

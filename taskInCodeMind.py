
import matplotlib.pyplot as plt
import pandas as pd
a=['Bizarrap, Peso Pluma',
'The Weeknd, Madonna, Playboi Carti',
'Fuerza Regida',
'Rï¿½ï¿½ma, Selena G',
'Tainy, Bad Bunny',
'Morgan Wallen']
b=[81,83,96,82,74,52,]
#plt.plot(a,b,c='black',linestyle='dashdot',linewidth=1)
#plt.scatter(a,b,c='b',marker='*',edgecolor='red')
#plt.barh(a,b,color='m')
#plt.bar(a,b,color='cyan')
explode = [0, 0, 0.5, 0, 0,0]
colors = ( "orange", "cyan", "yellow",
          "grey", "green","blue")
plt.pie(b,labels=a,explode=explode, autopct='%1.2f%%',
        colors=colors, shadow=True)
plt.title('Spotify',fontsize=25, color="blue")
#plt.xlabel('artist(s)_name--------->X-axis',color ="red")
#plt.ylabel('liveness_%---------->Y-axis',color="red")
plt.show()



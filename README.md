# Viapcraft :crystal_ball:

### Minecraft 1.16.5 Mod made built with the [Fabric API](https://fabricmc.net/)
* Currently in development.

#### How to run & contribute.
1. Clone this repo
2. Open your IDE
3. Navigatie to the repo folder and open the `build.gradle` file (open as project)
4. 5. NOTE: If an [icon of an elephant](https://i.imgur.com/3Sd7nny.png) appears in the top right corver of your scree, press it. 
5. After the project is done building, in your IDE, go to the menu option `Run > Edit configurations`
6. Select `Application > Minecraft Client` [(should look like this)](https://i.imgur.com/zd2nV3Q.png) and press OK
7. Now you should be able to run the mod by pressing the "Run" button.

#### Texture changes:
* All items which spawn in the world, such as Ore blocks, should be `16x16` pixels in size. 
* All other items can be made in greater detail, such as `32x32`, `64x64` etc.
* If your texture is a block, save it in the [following places](https://i.imgur.com/bDmQiPQ.png): 
  * `viapcraft-main\viap-craft\src\main\resources\assets\viapcraft\textures\items`
  * `viapcraft-main\viap-craft\src\main\resources\assets\viapcraft\textures\blocks`
  * `viapcraft-main\development-textures\blocks`
* If your new texture is an item save it in the following places: 
  * `viapcraft-main\viap-craft\src\main\resources\assets\viapcraft\textures\items`
  * `viapcraft-main\development-textures\items`

#### Code & texture changes:
* All changes and new features need to be first added to a new git branch. 
This branches should be appropriately named feature/VPC-NUMBER. 
  * Example `feature/VPC-1`
* Commit your changes with a short title
  * Example: `Implement dark_ruby ore, dark_ruby texture`
* Push your commit, then make a pull request.
* Your updates will be reviewed before they may be added to the main repo.   

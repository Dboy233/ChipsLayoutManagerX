# ChipsLayoutManagerX 

将 ChipsLayoutManager 升级为AndroidX 

原目地址  https://github.com/BelooS/ChipsLayoutManager

[![](https://jitpack.io/v/Dboy233/ChipsLayoutManagerX.svg)](https://jitpack.io/#Dboy233/ChipsLayoutManagerX)

```groovy

	dependencies {
	        implementation 'com.github.Dboy233:ChipsLayoutManagerX:LAST_VERSION'
	}

```

```

ChipsLayoutManager chipsLayoutManager = ChipsLayoutManager.newBuilder()
        //为一行中的所有项目设置位置权重. Default = Gravity.CENTER_VERTICAL
        .setChildGravity(Gravity.TOP)
        //RecyclerView 是否可以滚动. TRUE by default
        .setScrollingEnabled(true)
        //设置特定行中的最大预览个数
        .setMaxViewsInRow(2)
        //设置权重解析器，您可以在其中确定项目的位置权重
        //此方法优先于前一个(setChildGravity)
        .setGravityResolver(new IChildGravityResolver() {
            @Override
            public int getItemGravity(int position) {
                return Gravity.CENTER;
            }
        })
        //根据您的条件，您可以打破行规。需要断行的位置返回 true
        .setRowBreaker(new IRowBreaker() {
            @Override
            public boolean isItemBreakRow(@IntRange(from = 0) int position) {
                return position == 6 || position == 11 || position == 2;
            }
        })
        //布局管理器的 layoutOrientation，可以是 VERTICAL 或 HORIZONTAL. HORIZONTAL by default
        .setOrientation(ChipsLayoutManager.HORIZONTAL)
        // 已完成行中视图的行策略, 参数 STRATEGY_DEFAULT, STRATEGY_FILL_VIEW,
        //STRATEGY_FILL_SPACE or STRATEGY_CENTER
        .setRowStrategy(ChipsLayoutManager.STRATEGY_FILL_SPACE)
        //策略是否应用于最后一行, FALSE by default
        .withLastRow(true)
        .build();
rv.setLayoutManager(chipsLayoutManager);

```

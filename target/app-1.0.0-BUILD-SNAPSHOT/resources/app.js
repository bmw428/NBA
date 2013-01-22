Ext.application({
	name: "NBA",
	appFolder: 'app',
	launch: function() {
		Ext.create('Ext.container.Viewport', {
			layout: 'fit',
			items: [ 
			         {
			        	xtype: 'panel',
			        	title: 'NBA',
			        	html: 'List of Players will go here!'
			         }
			 ]
		});
	}
});
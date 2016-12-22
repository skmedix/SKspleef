package pl.skmedix.skspleef;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
		id = "skspleef",
		name = "SKspleef"
)
public class SKspleef {

	@Inject
	private Logger logger;


	@Listener
	public void onServerStart(GameStartedServerEvent event) {
		// Good start
	}
}

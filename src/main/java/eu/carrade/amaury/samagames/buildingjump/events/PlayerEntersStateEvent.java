/*
 * Copyright or © or Copr. AmauryCarrade (2015)
 * 
 * http://amaury.carrade.eu
 * 
 * This software is governed by the CeCILL-B license under French law and
 * abiding by the rules of distribution of free software.  You can  use, 
 * modify and/ or redistribute the software under the terms of the CeCILL-B
 * license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info". 
 * 
 * As a counterpart to the access to the source code and  rights to copy,
 * modify and redistribute granted by the license, users are provided only
 * with a limited warranty  and the software's author,  the holder of the
 * economic rights,  and the successive licensors  have only  limited
 * liability. 
 * 
 * In this respect, the user's attention is drawn to the risks associated
 * with loading,  using,  modifying and/or developing or reproducing the
 * software by the user in light of its specific status of free software,
 * that may mean  that it is complicated to manipulate,  and  that  also
 * therefore means  that it is reserved for developers  and  experienced
 * professionals having in-depth computer knowledge. Users are therefore
 * encouraged to load and test the software's suitability as regards their
 * requirements in conditions enabling the security of their systems and/or 
 * data to be ensured and,  more generally, to use and operate it in the 
 * same conditions as regards security. 
 * 
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-B license and that you accept its terms.
 */
package eu.carrade.amaury.samagames.buildingjump.events;

import eu.carrade.amaury.samagames.buildingjump.game.BuildingJumpPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;


/**
 * Event called when a player enters a state. When called, the new state was just set.
 *
 * @see PlayerLeavesStateEvent Event called when the player leaves the previous state (if any).
 */
public class PlayerEntersStateEvent extends BuildingJumpPlayerEvent
{
    private static final HandlerList handlers = new HandlerList();

    private final BuildingJumpPlayer.PlayerState newState;

    /**
     * @param player The player
     * @param newState The state the player just entered.
     */
    public PlayerEntersStateEvent(Player player, BuildingJumpPlayer.PlayerState newState)
    {
        super(player);
        this.newState = newState;
    }

    /**
     * @param player The player
     * @param newState The state the player just entered.
     */
    public PlayerEntersStateEvent(BuildingJumpPlayer player, BuildingJumpPlayer.PlayerState newState)
    {
        super(player.getPlayerIfOnline(), player);
        this.newState = newState;
    }

    /**
     * @return The state the player just entered.
     */
    public BuildingJumpPlayer.PlayerState getNewState()
    {
        return newState;
    }

    @Override
    public HandlerList getHandlers()
    {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

/**
 * This file is part of YiffBungee.
 *
 * YiffBungee is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * YiffBungee is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with YiffBungee.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.doridian.yiffbungee.main.util;

import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.List;

public class MultiplePlayersFoundException extends PlayerFindException {
	private static final long serialVersionUID = 1L;
	private List<ProxiedPlayer> players;

	public MultiplePlayersFoundException(List<ProxiedPlayer> players) {
		super("Sorry, multiple players found!");
		this.players = players;
	}

	public List<ProxiedPlayer> getPlayers() {
		return players;
	}
}

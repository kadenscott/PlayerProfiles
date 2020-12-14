/*
 * This file is part of PlayerProfiles.
 *
 * PlayerProfiles is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlayerProfiles is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with PlayerProfiles.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package dev.kscott.playerprofiles;

import com.google.inject.Singleton;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The main PlayerProfiles plugin class
 */
@Singleton
public final class PlayerProfilesPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

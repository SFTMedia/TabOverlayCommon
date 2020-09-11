/*
 *     Copyright (C) 2020 Florian Stober
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package de.codecrafter47.taboverlay.config.expression.token;

import de.codecrafter47.taboverlay.config.template.TemplateCreationContext;
import lombok.Getter;
import org.yaml.snakeyaml.error.Mark;

import java.text.ParsePosition;

public abstract class TokenReader {
    @Getter
    private final int priority;

    public TokenReader(int priority) {
        this.priority = priority;
    }

    public abstract Token read(String text, ParsePosition position, Mark mark, TemplateCreationContext tcc);

}

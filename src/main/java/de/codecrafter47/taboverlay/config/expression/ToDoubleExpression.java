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

package de.codecrafter47.taboverlay.config.expression;

import de.codecrafter47.taboverlay.config.context.Context;
import lombok.EqualsAndHashCode;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface ToDoubleExpression extends Expression {

    double evaluate();

    static ToDoubleExpression literal(double value) {
        return new ConstantToDoubleExpression(value);
    }

    @EqualsAndHashCode(callSuper = false)
    class ConstantToDoubleExpression implements ToDoubleExpression {
        private final double value;

        private ConstantToDoubleExpression(double value) {
            this.value = value;
        }

        @Override
        public double evaluate() {
            return value;
        }

        @Override
        public void activate(@Nonnull Context context, @Nullable ExpressionUpdateListener listener) {
            // nothing to do
        }

        @Override
        public void deactivate() {
            // nothing to do
        }
    }
}

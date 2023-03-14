import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-iniciar_sesion__administrador_')
export class VistaIniciar_sesion__administrador_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html``;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

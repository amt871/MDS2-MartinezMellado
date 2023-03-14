import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-buscar__no_registrado_')
export class VistaBuscar__no_registrado_ extends LitElement {
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

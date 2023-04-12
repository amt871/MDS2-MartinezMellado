import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-ver_perfil_privado__usuario_registrado_')
export class VistaVer_perfil_privado__usuario_registrado_ extends LitElement {
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

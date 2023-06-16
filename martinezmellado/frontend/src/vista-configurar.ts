import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-configurar')
export class VistaConfigurar extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center; background-color: #d8d8d8;">
 <vaadin-vertical-layout style="height: 50%; width: 100%; align-items: center; justify-content: center;">
  <img style="margin-top: var(--lumo-space-xl); max-height: 20%; max-width: 20%;" id="idImagen">
  <label id="idLabelPrivacidad">Tipo usuario</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="height: 50%; width: 100%; align-items: center; justify-content: center;">
  <vaadin-button style="background-color: black; color: white;" id="bSiguiendo">
    Siguiendo 
  </vaadin-button>
  <vaadin-button style="background-color: black; color: white;" id="bSeguidores">
    Seguidores 
  </vaadin-button>
  <vaadin-button style="background-color: black; color: white;" id="bCambioPrivacidad">
    Cambiar a cuenta privada/publica 
  </vaadin-button>
  <vaadin-button style="margin-bottom: var(--lumo-space-xl); background-color: black; color: white;" id="bModificarDatos">
    Modificar datos 
  </vaadin-button>
  <vaadin-button style="margin-top: var(--lumo-space-xl); background-color: red; color: white;" id="bCerrarSesion">
    Cerrar sesion 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}

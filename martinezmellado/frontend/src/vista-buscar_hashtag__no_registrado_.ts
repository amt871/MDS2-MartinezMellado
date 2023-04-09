import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_usuario_no_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-resultado_busqueda_hastag';

@customElement('vista-buscar_hashtag__no_registrado_')
export class VistaBuscar_hashtag__no_registrado_ extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-cabecera_usuario_no_registrado style="width: 100%;"></vista-cabecera_usuario_no_registrado>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 95%;">
  <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 100%;">
   <vista-resultado_busqueda_hastag style="width: 100%; height: 100%;"></vista-resultado_busqueda_hastag>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 40%; height: 100%; align-items: center; justify-content: center;">
   <vaadin-text-field style="width: 60%;"></vaadin-text-field>
   <vaadin-button style="width: 60%;">
    Buscar usuario
   </vaadin-button>
   <vaadin-button style="width: 60%;">
    Buscar hashtag
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
